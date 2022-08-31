FROM openjdk:12

# Create a new app directory for my application files

RUN mkdir /app

#Copy the app files from hist machine to image filesystem

COPY out/production/DockerBasics/ /app

#set the directory for executing future commands

WORKDIR /app

#Run the Main class

CMD java HelloWorld
