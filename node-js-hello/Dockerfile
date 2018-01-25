#
# NodeJsHello
#

# get the parent image.
FROM node:6.9.2

# set working directory; created if not existing.
WORKDIR /app

# copy all content from local machine to working directory.
COPY . .

# expose port 8082; must match with the implementation.
EXPOSE 8080

# start up the server.
CMD ["node", "server.js"]