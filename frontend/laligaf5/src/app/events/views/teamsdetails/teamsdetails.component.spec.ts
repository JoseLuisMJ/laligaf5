import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamsdetailsComponent } from './teamsdetails.component';

describe('TeamsdetailsComponent', () => {
  let component: TeamsdetailsComponent;
  let fixture: ComponentFixture<TeamsdetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TeamsdetailsComponent]
    });
    fixture = TestBed.createComponent(TeamsdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
