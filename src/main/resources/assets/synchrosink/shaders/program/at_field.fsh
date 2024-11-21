#version 150

// The game's render output
uniform sampler2D DiffuseSampler;

// The texture coordinate represented as a 2d vector
in vec2 texCoord;

// The output color of each pixel represented as a 4D vector (r,g,b,a)
out vec4 fragColor;

void main(){
    vec4 original = texture(DiffuseSampler, texCoord);
    vec3 tintColor = vec3(1.0, 0.0, 1.0);

    vec4 result = original * vec4(tintColor, 1.0);
    fragColor = result;
}