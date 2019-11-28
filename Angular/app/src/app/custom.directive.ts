import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
    // tslint:disable-next-line: directive-selector
    selector : '[custdir]'
})


// tslint:disable-next-line: directive-class-suffix
export class CustomDirectve {
        constructor(private e1: ElementRef) {
                this.e1.nativeElement.style.color = 'red';
        }

        @HostBinding('style.color') color = 'yellow';
        @HostBinding('style.backgroundColor') colorname = 'red';

        @HostListener('mouseenter')m() {
            this.e1.nativeElement.style.backgroundColor = 'blue';
        }
        @HostListener('mouseleave')n() {
            this.e1.nativeElement.style.backgroundColor = 'red';
        }

}
