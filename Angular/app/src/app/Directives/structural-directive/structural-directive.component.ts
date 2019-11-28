import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-directive',
  templateUrl: './structural-directive.component.html',
  styleUrls: ['./structural-directive.component.css']
})
export class StructuralDirectiveComponent implements OnInit {

  showorHide :boolean =false;

  constructor() {
    setTimeout(()=>{
      this.showorHide=true;
    },2000)
   }

  ngOnInit() {
  }

}
