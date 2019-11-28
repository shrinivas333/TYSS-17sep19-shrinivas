import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Customvalidation } from './custom.validation';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent implements OnInit {

  get email() {
    return this.form.get('email');
  }
  get password() {
    return this.form.get('password');
  }

  form = new FormGroup({
    email : new FormControl('', [Validators.required, Customvalidation.unique]),
    password : new FormControl('', [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  LoginData(form) {
      console.log(form);
  }
}
