<template>
    <div style="background-color: #ececec; padding: 20px">
      <a-row :gutter="16">
        <a-col :span="8">
          <ProjectCard />
        </a-col>
        <a-col :span="8">
          <ProjectCard />
        </a-col>
        <a-col :span="8">
          <ProjectCard />
        </a-col>
      </a-row>
    </div>
  </template>
  
  <script lang="ts">
    import {Col, Row} from 'ant-design-vue';
import ProjectCard from '@/components/ProjectCard.vue';
    import { defineComponent } from 'vue';
  export default defineComponent({
    components:{
      ACol : Col,
      ARow : Row,
      ProjectCard
    },
  })

</script>