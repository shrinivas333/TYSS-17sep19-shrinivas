import { Component, OnInit } from '@angular/core';
import { AuthserviceService } from '../authservice.service';

@Component({
  selector: 'app-searchname',
  templateUrl: './searchname.component.html',
  styleUrls: ['./searchname.component.css']
})
export class SearchnameComponent implements OnInit {
  produtslist;
  constructor(private auth: AuthserviceService) { }

  ngOnInit() {
  }
  searchproduct(form) {
    console.log(form.value.name);
    this.auth.searchproduct(form.value.name).subscribe( data => {
      console.log(data);
      this.auth.products = data.info;
       this.produtslist = data.info;
    }, err => {
      console.log(err);
    });
  }

}
