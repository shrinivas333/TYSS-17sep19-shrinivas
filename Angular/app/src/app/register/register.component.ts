import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit , DoCheck , AfterViewInit , AfterViewChecked , OnDestroy {
  users;
  selecteduser;
  today = new Date();
  constructor(private service: UserService) {
    this.getdata();
    console.log('constructor is executed');
  }

  ngOnInit() {
    console.log('ng OnInit executed');
  }
  ngDoCheck() {
    console.log('ng Do Check is executed');
  }
  ngAfterViewChecked() {
    console.log('ng Afterviewchecked is executed');
  }
  ngAfterViewInit() {
    console.log('ng AfterviewInIt is executed');
  }
  ngOnDestroy() {
    console.log('Ng Ondestroy fun is executed');
  }





  LoginData(form: NgForm) {
    console.log(form.value);
    this.service.postuser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data Posted sucessfully');
    });
  }
  getdata() {
    this.service.getusers().subscribe( data => {
      console.log(data);
      this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got sucessufully');
    });
  }
  deletedata(user) {
    console.log(user);
    this.service.deleteuser(user.id).subscribe( data => {
      console.log(data);
      this.getdata();
    }, err => {
      console.log(err);
    }, () => {
      console.log('data deleted sucessufully');
    });
  }
  selectuser(user) {
    console.log(user);
    this.selecteduser = user;
 }
 updatedata(form) {
   console.log(form.value);
   this.service.updateuser(form.value.id , form.value).subscribe(data => {
     console.log(data);
   }, err => {
     console.log(err);
   }, () => {
     console.log('data updated sucessfully');
   });
 }
}
