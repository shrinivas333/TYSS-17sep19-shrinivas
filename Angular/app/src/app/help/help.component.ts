import { Component } from '@angular/core';



@Component({
    // tslint:disable-next-line: component-selector
    selector : 'app-help',
    templateUrl : './help.component.html',
    styleUrls : ['./help.component.css']

})

export class HelpComponent {
    colorname = 'red';
    isActive= true;
        constructor() {
            setInterval(()=>{
                this.isActive= !this.isActive
            },2000)

         }
}
