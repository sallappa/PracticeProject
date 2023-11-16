import { Directive, ElementRef, Input, Renderer2 } from '@angular/core';
import { MyDirectiveDirective } from './my-directive.directive';
import { TestBed } from '@angular/core/testing';

describe('MyDirectiveDirective', () => {
  it('should create an instance', () => {
    TestBed.configureTestingModule({
      declarations: [directive],
    });
    const directive = TestBed.inject(directive);
    expect(directive).toBeTruthy();
  });
});
