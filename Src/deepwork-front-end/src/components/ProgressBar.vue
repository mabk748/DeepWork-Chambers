<template>
    <div>
      <!-- <a-tooltip title="3 done / 3 in progress / 4 to do">
        <a-progress :percent="60" :success="{ percent: 30 }" />
      </a-tooltip> -->
      <a-tooltip title="3 done / 3 in progress / 4 to do">
        <a-progress :percent="60" :success="{ percent: 30 }" type="circle" />
      </a-tooltip>
      <!-- <a-tooltip title="3 done / 3 in progress / 4 to do">
        <a-progress :percent="60" :success="{ percent: 30 }" type="dashboard" />
      </a-tooltip> -->
    </div>
  </template>

<script lang="ts">
import {Tooltip, Progress} from 'ant-design-vue';
import { defineComponent } from 'vue';
  export default defineComponent({
    components:{
      ATooltip : Tooltip,
      AProgress : Progress
    },
  })
  </script>