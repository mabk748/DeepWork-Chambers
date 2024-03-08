<template>
    <div style="background: #ececec; padding: 30px">
      <a-card  :bordered="false" style="width: 300px">
        <div class="Title">
            <h1>Title</h1>
            <ProgressBar />
        </div>
        <p>Card content</p>
        <p>Card content</p>
        <p>Card content</p>
      </a-card>
    </div>
  </template>
  
<style scoped>
    .Title{
        
    }
</style>

  <script lang="ts">
import {Card} from 'ant-design-vue';
import ProgressBar from '@/components/ProgressBar.vue';
    import { defineComponent } from 'vue';
  export default defineComponent({
    components:{
      ACard : Card,
      ProgressBar
    },
  })
  </script>