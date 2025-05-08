<script setup lang="ts">
import Navbar from './components/Navbar.vue'
</script>

<template>
  <div>
    <Navbar></Navbar>
    <!-- <img src="/vite.svg" class="logo" alt="Vite logo" /> -->
    <div class="container-fluid">
      <router-view></router-view>
    </div>

  </div>
</template>

<style scoped>
/* .logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
} */
</style>
