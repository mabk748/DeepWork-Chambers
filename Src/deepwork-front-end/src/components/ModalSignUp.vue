<template>
    <div>
      <a-modal
        v-model:open="loginstore.ShowLoginModal"
        title="Sign Up"
        width="100%"
        wrap-class-name="full-modal"
        @ok="handleOk"
      >
        <SignUpPage />
      </a-modal>
    </div>
  </template>
  <script lang="ts">
  import SignUpPage from '@/components/SignUpPage.vue'
  import {useStore} from '@/stores/Loginstore'
  import {Modal} from 'ant-design-vue';
  import { defineComponent } from 'vue';
  export default defineComponent({
    components:{
      AModal : Modal,
      SignUpPage
    },
    setup(){
      const loginstore = useStore();
      const handleOk = (e: MouseEvent) => {
        console.log(e);
        loginstore.toggleShowLoginModal();
      };
      return{
        loginstore,
        handleOk,
      }
    }
  })
  </script>
  <style lang="less">
  .full-modal {
    .ant-modal {
      max-width: 100%;
      top: 0;
      padding-bottom: 0;
      margin: 0;
    }
    .ant-modal-content {
      display: flex;
      flex-direction: column;
      height: calc(100vh);
    }
    .ant-modal-body {
      flex: 1;
    }
  }
  </style>