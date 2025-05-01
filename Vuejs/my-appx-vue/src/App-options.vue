<script>

export default {

  data() {
    return {
      name: "Aditya Arunachalam",
      status: true,
      code: "c009",
      tasks: ["T1", "T2", "T3", "T4"],
      image: "https://upload.wikimedia.org/wikipedia/commons/8/8d/Kabali_Flight.jpg",
      link: "https://www.google.com"
    }
  },
  methods: {
    toggleStatus() {
      this.status = !this.status
    }
  }
};

</script>

<template>
  <h1>Vue Jobs Portal</h1>
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