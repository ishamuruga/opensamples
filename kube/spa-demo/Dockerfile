# Stage 0, "build-stage", based on Node.js, to build and compile the frontend
FROM node:18 as build-stage
WORKDIR /app
COPY package*.json /app/
RUN npm install 
COPY ./ /app/
ARG configuration=production
RUN npm run build -- --output-path=./dist/out --configuration $configuration

# Stage 1, based on Nginx, to have only the compiled app, ready for production with Nginx
FROM nginx:1.15
#Copy ci-dashboard-dist
COPY --from=build-stage /app/dist/out/ /usr/share/nginx/html
#Copy default nginx configuration
COPY ./nginx-custom.conf /etc/nginx/conf.d/default.conf


# # # Stage 0, "build-stage", based on Node.js, to build and compile the frontend
# # FROM node:10.8.0 as build-stage
# # WORKDIR /app
# # COPY package*.json /app/
# # RUN npm install
# # COPY ./ /app/
# # ARG configuration=production
# # RUN npm run build -- --output-path=./dist/out --configuration $configuration

# # # Stage 1, based on Nginx, to have only the compiled app, ready for production with Nginx
# # FROM nginx:1.15
# # #Copy ci-dashboard-dist
# # COPY --from=build-stage /app/dist/out/ /usr/share/nginx/html
# # #Copy default nginx configuration
# # COPY ./nginx-custom.conf /etc/nginx/conf.d/default.conf


# # FROM node:alpine
# # WORKDIR /usr/src/app
# # COPY . /usr/src/app
# # RUN npm install -g @angular/cli
# # RUN npm install
# # CMD ["ng", "serve", "--host", "0.0.0.0"]

# ### STAGE 1:BUILD ###
# # Defining a node image to be used as giving it an alias of "build"
# # Which version of Node image to use depends on project dependencies 
# # This is needed to build and compile our code 
# # while generating the docker image
# FROM node:12.14-alpine AS build
# # Create a Virtual directory inside the docker image
# WORKDIR /dist/src/app
# # Copy files to virtual directory
# # COPY package.json package-lock.json ./
# # Run command in Virtual directory
# RUN npm cache clean --force
# # Copy files from local machine to virtual directory in docker image
# COPY . .
# RUN npm install
# RUN npm run build --prod


# ### STAGE 2:RUN ###
# # Defining nginx image to be used
# FROM nginx:latest AS ngi
# # Copying compiled code and nginx config to different folder
# # NOTE: This path may change according to your project's output folder 
# COPY --from=build /dist/src/app/dist/my-docker-angular-app /usr/share/nginx/html
# COPY /nginx.conf  /etc/nginx/conf.d/default.conf
# # Exposing a port, here it means that inside the container 
# # the app will be using Port 80 while running
# EXPOSE 80