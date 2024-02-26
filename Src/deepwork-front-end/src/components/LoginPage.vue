<template>
  <a-form
    :model="formState"
    name="basic"
    :label-col="{ span: 8 }"
    :wrapper-col="{ span: 16 }"
    autocomplete="off"
    @finish="onFinish"
    @finishFailed="onFinishFailed"
    style="width: 360px;"
  >
    <a-form-item
      label="Username"
      name="username"
      :rules="[{ required: true, message: 'Please input your username!' }]"
    >
      <a-input v-model:value="formState.username" />
    </a-form-item>

    <a-form-item
      label="Password"
      name="password"
      :rules="[{ required: true, message: 'Please input your password!' }]"
    >
      <a-input-password v-model:value="formState.password" />
    </a-form-item>

    <a-form-item name="remember" :wrapper-col="{ offset: 8, span: 16 }">
      <a-checkbox v-model:checked="formState.remember">Remember me</a-checkbox>
    </a-form-item>

    <a-form-item :wrapper-col="{ offset: 8, span: 16 }">
      <a-button type="primary" html-type="submit">Submit</a-button>
    </a-form-item>
  </a-form>
</template>

<script lang="ts">
import { defineComponent, ref } from 'vue';
import { Button, Form, InputPassword, FormItem, Input } from 'ant-design-vue';
interface FormState {
  username: string;
  password: string;
  remember: boolean;
}

export default defineComponent({
  components: {
    AButton: Button,
    AForm: Form,
    AInputPassword: InputPassword,
    AFormItem: FormItem,
    AInput: Input
  },
  setup() {
    const formState = ref<FormState>({
      username: '',
      password: '',
      remember: true
    });

    const onFinish = (values: any) => {
      console.log('Success:', values);
    };

    const onFinishFailed = (errorInfo: any) => {
      console.log('Failed:', errorInfo);
    };

    return {
      formState,
      onFinish,
      onFinishFailed
    };
  }
});
</script>
