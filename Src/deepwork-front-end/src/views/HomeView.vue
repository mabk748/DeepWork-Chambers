<template>
  <div class="home">
    <Navbar />
    <div class="Home-content-style">
      <h1>{{ pageTitle }}</h1>
      <a-button type="primary" @click="goToLogin">Get started</a-button>
      <a-button type="primary" @click="goToAPP">Get To APP (temporary)</a-button>
    </div>
    <div class="footer">
      <p>Footer of the homepage to think about</p>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import { useRouter } from 'vue-router';
import { Button } from 'ant-design-vue';
import Navbar from '@/components/NavigationBar.vue'
export default defineComponent({
  name: 'HomeView',
  components: {
    Navbar,
    AButton: Button
  },
  setup(){
    const router = useRouter();
    const goToLogin = () => {
      router.push('/login');
    };
    const goToAPP = () => {
      router.push('/galery');
    };
    return {
      goToLogin, goToAPP
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
