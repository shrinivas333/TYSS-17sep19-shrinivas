import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-comments',
  templateUrl: './comments.component.html',
  styleUrls: ['./comments.component.css']
})
export class CommentsComponent implements OnInit {
@Output() getcomment=new EventEmitter();
  constructor() { }

  ngOnInit() {
  }
  formData(form : NgForm) {
    console.log(form.value);
    this.getcomment.emit(form.value)
  }
}
