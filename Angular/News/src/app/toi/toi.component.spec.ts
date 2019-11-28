import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TOIComponent } from './toi.component';

describe('TOIComponent', () => {
  let component: TOIComponent;
  let fixture: ComponentFixture<TOIComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TOIComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TOIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
