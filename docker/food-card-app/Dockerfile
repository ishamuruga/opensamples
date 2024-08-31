FROM node:20.17.0 AS build
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm install
RUN npm install -g @angular/cli
COPY . .
RUN ng build --configuration=production
### STAGE 2: Run ###
FROM nginx:latest
COPY --from=build  app/dist/food-card-app/browser  /usr/share/nginx/html
EXPOSE 80