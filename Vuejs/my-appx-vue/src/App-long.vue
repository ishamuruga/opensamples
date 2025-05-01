<script>

import { ref } from 'vue';

export default {
  setup() {
    const name = ref("Aditya Arunachalam");
    const status = ref(true);
    const code = ref("c009");
    const tasks = ref(["T1", "T2", "T3", "T4"]);
    const image = ref("https://upload.wikimedia.org/wikipedia/commons/8/8d/Kabali_Flight.jpg");
    const link = ref("https://www.google.com");
    const toggleStatus = () => {
      status.value = !status.value;
      if (status.value) {
        image.value = "https://upload.wikimedia.org/wikipedia/commons/e/ea/Mahabalipuram_pano2.jpg";
      } else {
        image.value = "https://upload.wikimedia.org/wikipedia/commons/6/6a/Shore_temple_1921.jpg"
      }
    }

    return {
      name, status, code, tasks, image, link, toggleStatus
    }
  },

};

</script>

<template>
  <h1>Vue Jobs Portals</h1>
  <h2>{{ name }}</h2>
  <p v-if="status">Use is Super Human</p>
  <p v-else="status">Use is not Super Human</p>

  <p v-if="code === 'c007'">Use is double O 7</p>
  <p v-else-if="code === 'c006'">Use is double o 6</p>
  <p v-else="status">Use is normal employee</p>

  <h3>Tasks</h3>
  <ul>
    <li v-for="task in tasks" :key="task">{{ task }}</li>
  </ul>
  <a v-bind:href="link">Google</a>
  <img :src="image" />

  <!-- <button v-on:click="toggleStatus">Change Status</button> -->
  <button @click="toggleStatus">Change Status</button>
</template>

<style scoped>
h1 {
  color: red;
}

img {
  width: 300px;
  height: 200px;
}
</style>