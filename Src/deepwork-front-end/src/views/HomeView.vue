<template>
  <div class="home">
    <Navbar />
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import Navbar from '@/components/NavigationBar.vue'
export default defineComponent({
  name: 'HomeView',
  components: {
    Navbar
  },
});
</script>
