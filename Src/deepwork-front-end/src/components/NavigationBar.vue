<template>
  <div class="Navbar-style">
    <a-layout-header>
      <div class="Navbar-components-style">
        <div class="logo">DeepWork</div>
        <a-input
          placeholder="Rechercher..."
          style="width: 200px;"
        />
        <div style="position: absolute; right: 0px;">
          <a-menu
          theme="light"
          mode="horizontal"
          :default-selected-keys="['1']"
          style="line-height: 64px;"
        >
          <a-menu-item key="1">Accueil</a-menu-item>
          <a-menu-item key="2">À Propos</a-menu-item>
          <a-menu-item key="3">Login</a-menu-item>
        </a-menu>
        </div>
        
      </div>
      
    </a-layout-header>
  </div>
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
});
</script>

<style scoped>
.Navbar-components-style {
  display: flex;
  align-items: center;
  
}
.Navbar-style{
  border-bottom: #919191;
}
.logo {
  color: #000;
  font-size: 1.5em;
  margin-right: 20px;
  line-height: 64px;
}
</style>
