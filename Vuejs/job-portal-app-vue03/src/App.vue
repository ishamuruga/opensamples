<script setup lang="ts">
import AppNavbar from '@/components/AppNavbar.vue';
import MainScreenHeader from '@/components/MainScreenHeader.vue';

</script>


<template>
  <AppNavbar></AppNavbar>
  <div class="jumbotron custom_bg">
    <div class="container-fluid vertical-center">
      <MainScreenHeader title="Become a Front End Developer" subtitle="Tech Stack for NextGen Apps"></MainScreenHeader>
    </div>
  </div>

</template>

<style scoped>
.custom_bg {
  background-color: rgb(209, 239, 209);
  height: 120px;
  text-align: center;
}

.vertical-center {
  margin: 0;
  position: relative;
  top: 50%;
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
}

p {
  font-weight: bold;
  font-size: 20;
  color: blue
}
</style>