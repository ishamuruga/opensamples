# FROM node:20.17.0 AS build
# WORKDIR /app
# COPY package.json package-lock.json ./
# RUN npm install
# RUN npm install -g @angular/cli
# COPY . .
# RUN ng build --configuration=production
# ### STAGE 2: Run ###
# FROM nginx:latest
# COPY --from=build  app/dist/food-card-app/browser  /usr/share/nginx/html
# EXPOSE 80

# Stage 1: Use the official Node.js Alpine image as the base image
FROM node:21-alpine3.18 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy necessary files for dependency installation
COPY package.json package-lock.json angular.json ./

# Install the Angular CLI 
RUN npm install -g @angular/cli

# Install Yarn package manager
RUN apk add yarn

# Install project dependencies using Yarn
# RUN yarn install
RUN npm install

# Copy the entire application to the container
COPY . .

# Build the Angular app with production configuration
RUN ng build --configuration=production

# Stage 2: Create a new image with a smaller base image (NGINX)
FROM nginx:1.25.3-alpine-slim

# Copy the NGINX configuration file to the appropriate location
COPY frontend-nginx-config.conf /etc/nginx/nginx.conf

# Copy the built Angular app from the 'calipharma' image to the NGINX HTML directory
COPY --from=build /app/dist/food-card-app/browser /usr/share/nginx/html

# Specify the command to run NGINX in the foreground
CMD ["nginx", "-g", "daemon off;"]
