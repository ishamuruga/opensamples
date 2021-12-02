import { TestBed } from '@angular/core/testing';

import { DatacommService } from './datacomm.service';

describe('DatacommService', () => {
  let service: DatacommService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DatacommService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
