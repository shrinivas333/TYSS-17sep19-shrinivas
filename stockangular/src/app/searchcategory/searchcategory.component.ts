import { Component, OnInit } from '@angular/core';
import { AuthserviceService } from '../authservice.service';

@Component({
  selector: 'app-searchcategory',
  templateUrl: './searchcategory.component.html',
  styleUrls: ['./searchcategory.component.css']
})
export class SearchcategoryComponent implements OnInit {
products;
  constructor(private auth: AuthserviceService) { }

  search(form) {
    this.auth.search(form.value.name).subscribe( data => {
      this.products = data.infos;
    }, err => {
      console.log(err);
    });
  }
  selectproduct(product) {
    this.auth.orderlist = product;
  }
  ngOnInit() {
  }

}
