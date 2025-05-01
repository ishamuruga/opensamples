<script setup>

import { ref, onMounted } from 'vue';


const name = ref("Padiyappa");
const status = ref(true);
const code = ref("c009");
const tasks = ref(["T1", "T2", "T3", "T4"]);
const image = ref("https://upload.wikimedia.org/wikipedia/commons/8/8d/Kabali_Flight.jpg");
const link = ref("https://www.google.com");

const newTask = ref("");

const toggleStatus = () => {
  status.value = !status.value;
  if (status.value) {
    image.value = "https://upload.wikimedia.org/wikipedia/commons/e/ea/Mahabalipuram_pano2.jpg";
  } else {
    image.value = "https://upload.wikimedia.org/wikipedia/commons/6/6a/Shore_temple_1921.jpg"
  }
}

const addTask = () => {

  if (newTask.value.trim() != "") {
    tasks.value.push(newTask.value);
    newTask.value = "";
  } else {
    toggleStatus()
  }

}

const deleteTask = (index) => {
  console.log(index);
  tasks.value.splice(index, 1);
}

// onMounted(async () => {
//   try {
//     const response = await fetch("http://localhost:3000/tasks")
//     const data = await response.json()
//     console.log(data)
//     tasks.value = data.map((task) => task.title))
//   } catch (err) {

// }
// )

onMounted(async () => {
  try {
    const response = await fetch("http://localhost:3000/tasks");
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    const data = await response.json();
    // console.log(data);
    console.log(data.map(x => x.title));
    tasks.value = data.map(x => x.title);
    // tasks.value = data.task.map((task) => task.title));
  } catch (err) {
    console.log(err)
  } finally {
    console
  }
});


</script>

<template>
  <h1>Vue Jobs Portals</h1>
  <h2>{{ name }}</h2>
  <p v-if="status">Use is Super Human</p>
  <p v-else="status">Use is not Super Human</p>

  <p v-if="code === 'c007'">Use is double O 7</p>
  <p v-else-if="code === 'c006'">Use is double o 6</p>
  <p v-else="status">Use is normal employee</p>
  <form @submit.prevent="addTask">
    <label for="newtask">Add Task</label>
    <input type="text" id="newtask" name="newtask" v-model="newTask" />
    <button type="submit">Add</button>
  </form>

  <h3>Tasks</h3>
  <ul>
    <!-- <li v-for="task in tasks" :key="task"> -->
    <li v-for="(task, index) in tasks" :key="task">
      <span>{{ task }}</span>
      <button @click="deleteTask(index)">X</button>
    </li>
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