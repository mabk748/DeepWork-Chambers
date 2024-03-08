<template>
    <div class="home">
      <Navbar />
      <h1 class="Welcomer">Welcome to The Galery</h1>

      <ProjCol />
      <ProjCol />
    <div class="buttons">
        <a-button></a-button>
    </div>
    </div>
  </template>
  
  <script lang="ts">
  import { defineComponent } from 'vue';
  import { useRouter } from 'vue-router';
  import { Button } from 'ant-design-vue';
  import Navbar from '@/components/NavigationBar.vue'
  import ProjCol from '@/components/ProjectCardCol.vue'
  export default defineComponent({
    name: 'HomeView',
    components: {
      Navbar,
      ProjCol,
      AButton: Button
    },
    setup(){
      const router = useRouter();
      const goToLogin = () => {
        router.push('/login');
      };
      return {
        goToLogin
      };
    },
    data() {
      return {
        pageTitle: 'DeepWork Chambers'
      };
    }
  });
  </script>
  <style scoped>
  .Home-content-style{
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-between;
    margin: 100px;
  };
  .footer {
    background-color: #f0f2f5;
    padding: 20px;
    text-align: center;
    margin-top: 100px;
    bottom: 0;
  }
  </style>
  