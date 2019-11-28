import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchvalueComponent } from './searchvalue.component';

describe('SearchvalueComponent', () => {
  let component: SearchvalueComponent;
  let fixture: ComponentFixture<SearchvalueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchvalueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchvalueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
