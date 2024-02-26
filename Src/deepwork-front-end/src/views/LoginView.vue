<template>
  <Navbar />
  <div class="container">
    <h2>Login</h2>
    <div class="login-page-wrapper">
      <LoginPage />
    </div>
  </div>
</template>

<script lang="ts" setup>
import Navbar from '@/components/NavigationBar.vue'
import LoginPage from '@/components/LoginPage.vue'
</script>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  align-items: center; /* Center content horizontally */
}

.login-page-wrapper {
  margin-top: 20px; /* Add some space between Navbar and LoginPage */
}
</style>
