import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  Inputdata = 'Enter your name';

  constructor() {

   }

  ngOnInit() {
  }
   // tslint:disable-next-line: no-trailing-whitespace
   
  printalertmsg() {
      alert('Hai hello');
    }
    InputData(event) {
       console.log(event.target.value);
       this.Inputdata = event.target.value;
    }
}
