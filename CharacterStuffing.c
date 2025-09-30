#include <stdio.h>
#include <string.h>

#define FRAME_START_DELIMITER '/'
#define FRAME_END_DELIMITER '/'

// Function to perform character stuffing
void characterStulling(char* input, char* stuffed) {
    int stuffed_index = 0;
    int i; /* <-- VARIABLE 'i' IS DECLARED HERE */

    for (i = 0; i < strlen(input); i++) { /* <-- 'int' IS REMOVED FROM HERE */
        if (input[i] == FRAME_START_DELIMITER || input[i] == FRAME_END_DELIMITER) {
            stuffed[stuffed_index++] = FRAME_START_DELIMITER;
            stuffed[stuffed_index++] = input[i];
        } else {
            stuffed[stuffed_index++] = input[i];
        }
    }
    stuffed[stuffed_index] = '\0';
}

int main() {
    char input[100];
    char stuffed[200];

    // clrscr(); // You might want to add this to clear the screen in Turbo C++

    printf("Enter the input string: ");
    gets(input);

    characterStulling(input, stuffed);

    printf("\nOriginal string: %s", input);
    printf("\nStuffed string: %s", stuffed);

    // getch(); // You might need this to hold the output screen
    return 0;
}