#version 150

#moj_import <lodestone:common_math.glsl>

// The game's render output/depth buffer
uniform sampler2D DiffuseSampler;
uniform sampler2D MainDepthSampler;

// Multi-Instance uniforms
uniform samplerBuffer DataBuffer;
uniform int InstanceCount;

// Matrices needed for world position calculation
uniform mat4 invProjMat;
uniform mat4 invViewMat;

//
uniform vec3 cameraPos;

// The texture coordinate represented as a 2d vector
in vec2 texCoord;
// The output color of each pixel represented as a 4D vector (r,g,b,a)
out vec4 fragColor;

void main(){
    fragColor = texture(DiffuseSampler, texCoord);
}