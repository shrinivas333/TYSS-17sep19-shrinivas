import { AbstractControl, ValidationErrors } from '@angular/forms';
import { ReturnStatement } from '@angular/compiler';



export class Customvalidation {
        constructor() { }

        static unique(control: AbstractControl): ValidationErrors | null {
            if (control.value === 'jhon@gmail.com') {
                return { unique : true};
            } else {
                return null;
            }

        }
}
