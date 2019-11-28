import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comments-details',
  templateUrl: './comments-details.component.html',
  styleUrls: ['./comments-details.component.css']
})
export class CommentsDetailsComponent implements OnInit {
  comments: any[] = [];
  constructor() { }

  ngOnInit() {
  }
  getAllcomment(eventdata) {
    this.comments.push( eventdata);
    console.log(this.comments)
  }
}
