import { TestBed } from '@angular/core/testing';

import { TeamsdetailsService } from './teamsdetails.service';

describe('TeamsdetailsService', () => {
  let service: TeamsdetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TeamsdetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
