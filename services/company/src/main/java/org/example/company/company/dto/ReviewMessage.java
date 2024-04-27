package org.example.company.company.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewMessage {
  private Long id;
  private String title;
  private String message;
  private double rating;
  private Long companyId;
}
