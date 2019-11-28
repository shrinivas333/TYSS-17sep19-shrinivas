import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BBCComponent } from './bbc.component';

describe('BBCComponent', () => {
  let component: BBCComponent;
  let fixture: ComponentFixture<BBCComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BBCComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BBCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
