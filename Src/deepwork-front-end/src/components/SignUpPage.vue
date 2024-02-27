<template>
    <a-form
      :label-col="labelCol"
      :wrapper-col="wrapperCol"
      layout="horizontal"
      style="max-width: 600px"
    >
      <a-form-item label="First Name">
        <a-input />
      </a-form-item>
      <a-form-item label="Last Name">
        <a-input />
      </a-form-item>
      <a-form-item label="Gender">
        <a-select>
          <a-select-option value="demo">Male</a-select-option>
          <a-select-option value="demo">Female</a-select-option>
        </a-select>
      </a-form-item>
      <a-form-item label="Age">
        <a-date-picker />
      </a-form-item>
      <a-form-item label="Email">
        <a-input />
      </a-form-item>
      <a-form-item
        label="Password"
        name="password"
        :rules="[{ required: true, message: 'Please input your password!' }]"
      >
        <a-input-password v-model:value="formState.password" />
      </a-form-item>
    </a-form>
  </template>
  <script lang="ts">
  import { ref, defineComponent } from 'vue';
  import { Form, InputPassword, FormItem, Input,SelectOption, Select, DatePicker } from 'ant-design-vue';
  interface FormState {
  username: string;
  password: string;
  remember: boolean;
}
  export default defineComponent({
    components:{
      AForm: Form,
      AInputPassword: InputPassword,
      AFormItem: FormItem,
      AInput: Input,
      ASelectOption: SelectOption,
      ASelect: Select,
      ADatePicker : DatePicker
    },
    setup (){
      const labelCol = { style: { width: '150px' } };
      const wrapperCol = { span: 14 };
      const formState = ref<FormState>({
      username: '',
      password: '',
      remember: true
    });
      return{
        labelCol,
        wrapperCol,
        formState
      }
    }
  })
  </script>
  