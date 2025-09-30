// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>
// #include <unistd.h>
// #include <arpa/inet.h>

// #define PORT 8080
// #define BUFFER_SIZE 1024

// int main() {
//     int server_fd, new_socket;
//     struct sockaddr_in server_address, client_address;
//     socklen_t addr_len = sizeof(client_address);
//     char buffer[BUFFER_SIZE];

//     // Create a socket
//     if ((server_fd = socket(AF_INET, SOCK_STREAM, 0)) == 0) {
//         perror("Socket creation failed");
//         exit(EXIT_FAILURE);
//     }

//     server_address.sin_family = AF_INET;
//     server_address.sin_addr.s_addr = INADDR_ANY;
//     server_address.sin_port = htons(PORT);

//     // Bind the socket to the specified address and port
//     if (bind(server_fd, (struct sockaddr*)&server_address, sizeof(server_address)) < 0) {
//         perror("Bind failed");
//         exit(EXIT_FAILURE);
//     }

//     // Listen for incoming connections
//     if (listen(server_fd, 3) < 0) {
//         perror("Listen failed");
//         exit(EXIT_FAILURE);
//     }

//     printf("Listening on port %d...\n", PORT);

//     while (1) {
//         // Accept a new connection
//         if ((new_socket = accept(server_fd, (struct sockaddr*)&client_address, &addr_len)) < 0) {
//             perror("Accept failed");
//             exit(EXIT_FAILURE);
//         }

//         printf("Accepted a connection from %s:%d\n",
//                inet_ntoa(client_address.sin_addr),
//                ntohs(client_address.sin_port));

//         while (1) {
//             // Receive data from the client
//             int bytes_received = recv(new_socket, buffer, BUFFER_SIZE, 0);
//             if (bytes_received <= 0) {
//                 // Connection closed or error
//                 close(new_socket);
//                 break;
//             }

//             // Add a null terminator to the received data
//             buffer[bytes_received] = '\0';

//             // Display the received data
//             printf("Received: %s", buffer);

//             // Echo the data back to the client
//             send(new_socket, buffer, strlen(buffer), 0);
//         }
//     }

//     return 0;
// }