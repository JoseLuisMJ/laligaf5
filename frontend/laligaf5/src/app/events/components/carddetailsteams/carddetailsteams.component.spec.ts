import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarddetailsteamsComponent } from './carddetailsteams.component';

describe('CarddetailsteamsComponent', () => {
  let component: CarddetailsteamsComponent;
  let fixture: ComponentFixture<CarddetailsteamsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CarddetailsteamsComponent]
    });
    fixture = TestBed.createComponent(CarddetailsteamsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
