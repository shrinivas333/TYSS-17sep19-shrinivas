import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  addreq(form: NgForm) {
    console.log(form.value);
  } 
  scheduleInterview(form2 : NgForm) {
    console.log(form2.value);
  }
  AddUser(form3 : NgForm) {
    console.log(form3.value);
  }
  AddProduct(form4 : NgForm) {
      console.log(form4);
  }

} 
