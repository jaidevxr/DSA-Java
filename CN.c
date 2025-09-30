#include <stdio.h>
#include <string.h>

#define FRAME_START_DELIMITER '~'
#define FRAME_END_DELIMITER '~'

void characterStuffing(char* input, char* stuffed) {
    int stuffed_index = 0;
    for (int i = 0; input[i] != '\0'; i++) {
        if (input[i] == FRAME_START_DELIMITER || input[i] == FRAME_END_DELIMITER) {
            // Add stuffing
            stuffed[stuffed_index++] = FRAME_START_DELIMITER;
            stuffed[stuffed_index++] = input[i];
            stuffed[stuffed_index++] = FRAME_END_DELIMITER;
        } else {
            stuffed[stuffed_index++] = input[i];
        }
    }
    stuffed[stuffed_index] = '\0';
}

int main() {
    char input[100], stuffed[300]; 
    printf("Enter the Input string: ");
    
    // Use fgets instead of gets for safety
    if (fgets(input, sizeof(input), stdin) != NULL) {
        // Remove newline character if present
        size_t len = strlen(input);
        if (len > 0 && input[len - 1] == '\n') {
            input[len - 1] = '\0';
        }

        characterStuffing(input, stuffed);
        printf("Original string: %s\n", input);
        printf("Stuffed string: %s\n", stuffed);
    } else {
        printf("Error reading input.\n");
    }

    return 0;
}