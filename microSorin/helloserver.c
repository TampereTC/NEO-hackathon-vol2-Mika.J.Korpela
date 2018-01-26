#include<arpa/inet.h> //inet_addr
int main(int argc , char *argv[])
{
    int socket_desc , client_sock , c, readbytes;
    struct sockaddr_in server , client;
    char client_message[2000];
    char hello_message[]="HTTP/1.1 200 OK\nContent-Length: 12\nConnection: close\nContent-Type: text/html; charset=UTF-8\n\nHello world!";
    socket_desc = socket(AF_INET , SOCK_STREAM, 0);
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = INADDR_ANY;
    server.sin_port = htons( 8888 );
    bind(socket_desc,(struct sockaddr *)&server , sizeof(server));
    listen(socket_desc , 666);
    c = sizeof(struct sockaddr_in);
    readbytes=0;
    while(1)
    {
        if (readbytes == 0)
          client_sock=accept(socket_desc, (struct sockaddr *)&client, (socklen_t*)&c);
        else 
          send(client_sock , hello_message , 110, 0);
        readbytes=recv(client_sock , client_message , 2000 , 0);        
    }    
}
