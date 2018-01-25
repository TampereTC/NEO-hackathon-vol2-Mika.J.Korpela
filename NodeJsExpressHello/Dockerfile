#
# hello-world-express
#
FROM node:6.9.2
WORKDIR /app
COPY . .
EXPOSE 8081
ENV HTTP_PROXY http://10.144.1.10:8080
RUN npm --proxy $HTTP_PROXY install
CMD ["npm", "start"]