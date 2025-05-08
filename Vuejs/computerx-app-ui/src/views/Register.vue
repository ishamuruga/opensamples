<script setup lang="ts">

import { useForm, useField } from 'vee-validate';
import * as yup from 'yup';

const schema = yup.object({
    firstname: yup.string().min(6, "Altest 6 Chars").required("cannot be empty  "),
    lastname: yup.string().min(6).required(),
    email: yup.string().email().required(),
    phonenumber: yup.number().positive().required(),
});

// Setup form
const { handleSubmit } = useForm({
    validationSchema: schema
});

const { value: firstname, errorMessage: firstnameError } = useField('firstname');
const { value: lastname, errorMessage: lastnameError } = useField('lastname');
const { value: email, errorMessage: emailError } = useField('email');
const { value: phonenumber, errorMessage: phonenumberError } = useField('phonenumber');

const onSubmit = handleSubmit(values => {
    console.log('Form Submitted:', values);
});

</script>
<template>
    <div>
        <section class="vh-100 gradient-custom">
            <div class="container py-5 h-100">
                <div class="row justify-content-center align-items-center h-100">
                    <div class="col-12 col-lg-9 col-xl-7">
                        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Registration Form</h3>
                                <form @submit.prevent="onSubmit">

                                    <div class="row">
                                        <div class="col-md-6 mb-4">

                                            <div data-mdb-input-init class="form-outline">
                                                <input type="text" id="firstName" class="form-control form-control-lg"
                                                    v-model="firstname" />
                                                <label class=" form-label" for="firstName">First Name</label>
                                                <p class="error">{{ firstnameError }}</p>
                                            </div>

                                        </div>
                                        <div class="col-md-6 mb-4">

                                            <div data-mdb-input-init class="form-outline">
                                                <input type="text" id="lastName" class="form-control form-control-lg"
                                                    v-model="lastname" />
                                                <label class="form-label" for="lastName">Last Name</label>
                                                <p class="error">{{ lastnameError }}</p>
                                            </div>

                                        </div>
                                    </div>



                                    <div class="row">
                                        <div class="col-md-6 mb-4 pb-2">

                                            <div data-mdb-input-init class="form-outline">
                                                <input type="email" id="emailAddress"
                                                    class="form-control form-control-lg" v-model="email" />
                                                <label class="form-label" for="emailAddress">Email</label>
                                                <p class="error">{{ emailError }}</p>
                                            </div>

                                        </div>
                                        <div class="col-md-6 mb-4 pb-2">

                                            <div data-mdb-input-init class="form-outline">
                                                <input type="tel" id="phoneNumber" class="form-control form-control-lg"
                                                    v-model="phonenumber" />
                                                <label class="form-label" for="phoneNumber">Phone Number</label>
                                                <p class="error">{{ phonenumberError }}</p>
                                            </div>

                                        </div>
                                    </div>

                                    <div class="mt-4 pt-2">
                                        <input data-mdb-ripple-init class="btn btn-primary btn-lg" type="submit"
                                            value="Submit" />
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</template>
<style scoped>
.gradient-custom {
    /* fallback for old browsers */
    background: #f093fb;

    /* Chrome 10-25, Safari 5.1-6 */
    background: -webkit-linear-gradient(to bottom right, rgba(240, 147, 251, 1), rgba(245, 87, 108, 1));

    /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
    background: linear-gradient(to bottom right, rgba(240, 147, 251, 1), rgba(245, 87, 108, 1))
}

.card-registration .select-input.form-control[readonly]:not([disabled]) {
    font-size: 1rem;
    line-height: 2.15;
    padding-left: .75em;
    padding-right: .75em;
}

.card-registration .select-arrow {
    top: 13px;
}

.error {
    color: red;
    font-size: 10;
    font-weight: bold;
}
</style>