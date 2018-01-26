FROM gcc:4.9
COPY . /usr/src/helloserver
WORKDIR /usr/src/helloserver
EXPOSE 8888
RUN gcc -o helloserver helloserver.c
CMD ["./helloserver"]