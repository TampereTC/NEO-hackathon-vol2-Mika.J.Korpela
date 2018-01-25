#
# PythoFlaskHello
#

# get the parent image.
FROM python:2.7-alpine

# set working directory; created if not existing.
WORKDIR /app

# copy all content from local machine to working directory.
COPY . .

# expose port 8082; must match with the implementation.
EXPOSE 8082

# set HTTPS_PROXY environment variable for pip.
ENV HTTPS_PROXY http://10.144.1.10:8080

# install Python script dependencies.
RUN pip install -r requirements.txt

# start up the server.
CMD ["python", "server.py"]