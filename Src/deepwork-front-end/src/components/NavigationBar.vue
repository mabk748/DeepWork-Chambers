<template>
  <a-layout-header>
    <div class="logo">MonSite</div>
    <a-input
      placeholder="Rechercher..."
      style="width: 200px;"
    />
    <a-menu
      theme="light"
      mode="horizontal"
      :default-selected-keys="['1']"
      style="line-height: 64px;"
    >
      <a-menu-item key="1">Accueil</a-menu-item>
      <a-menu-item key="2">À Propos</a-menu-item>
      <a-menu-item key="3">Services</a-menu-item>
      <a-menu-item key="4">Contact</a-menu-item>
    </a-menu>
  </a-layout-header>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import { Layout, Menu, Input } from 'ant-design-vue';

export default defineComponent({
  components: {
    ALayoutHeader: Layout.Header,
    AMenu: Menu,
    AMenuItem: Menu.Item,
    AInput: Input
  },
  data() {
    return {
      theme: 'dark', // Choisissez entre 'dark' ou 'light' selon votre préférence
      mode: 'horizontal' // Choisissez entre 'horizontal' ou 'vertical' selon votre préférence
    };
  }
});
</script>

<style scoped>
.logo {
  color: #fff;
  float: left;
  font-size: 1.5em;
  margin-right: 20px;
  line-height: 64px;
}

/* Styles spécifiques à votre barre de navigation peuvent être ajoutés ici */
</style>

  