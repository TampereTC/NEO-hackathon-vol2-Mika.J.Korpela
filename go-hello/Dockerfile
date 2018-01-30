#FROM golang:1.7.3 AS build
#WORKDIR /go/src/project
#COPY go-hello.go .
#RUN go build -o /bin/project/go-hello.exe

FROM golang:1.8 AS build
RUN mkdir -p /go/src/helloworld  
WORKDIR /go/src/helloworld
COPY main.go /go/src/helloworld
ENV CGO_ENABLED=0
ENV GOOS=linux
RUN go build  -ldflags '-w -s' -a -installsuffix cgo -o helloworld

FROM scratch
WORKDIR /go/src/helloworld
#COPY --from=build /bin/project/go-hello.exe .
COPY --from=build /go/src/helloworld/helloworld .
EXPOSE 8000
CMD ["./helloworld"]